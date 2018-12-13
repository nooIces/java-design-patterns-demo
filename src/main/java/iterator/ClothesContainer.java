package iterator;

public class ClothesContainer implements Container {

    public String[] s = new String[]{"hat", "trousers", "shirt"};

    @Override
    public Iterator iterator() {
        return new ClothesIterator();
    }

    private class ClothesIterator implements Iterator{

        private int index;

        public ClothesIterator(){
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < s.length;
        }

        @Override
        public Object next() {
            return s[index++];
        }
    }
}
