package behavioral.iterator;

class Song {
    private String title;
    private String artist;
    private int duration; // in seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + "s)";
    }
}

interface Playlist {
    void addSong(Song song);
    void removeSong(Song song);
    Iterator<Song> getIterator();
}

// Array-based playlist implementation
class ArrayPlaylist implements Playlist {
    private Song[] songs;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayPlaylist() {
        songs = new Song[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void addSong(Song song) {
        if (size == songs.length) {
            // Resize array if needed
            Song[] newSongs = new Song[songs.length * 2];
            System.arraycopy(songs, 0, newSongs, 0, songs.length);
            songs = newSongs;
        }
        songs[size++] = song;
    }

    @Override
    public void removeSong(Song song) {
        for (int i = 0; i < size; i++) {
            if (songs[i].equals(song)) {
                System.arraycopy(songs, i + 1, songs, i, size - i - 1);
                size--;
                songs[size] = null;
                break;
            }
        }
    }

    @Override
    public Iterator<Song> getIterator() {
        return new ArrayPlaylistIterator();
    }

    private class ArrayPlaylistIterator implements Iterator<Song> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Song next() {
            if (hasNext()) {
                return songs[currentIndex++];
            }
            return null;
        }

        @Override
        public void reset() {
            currentIndex = 0;
        }
    }
}
