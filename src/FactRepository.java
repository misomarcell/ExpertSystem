public class FactRepository {
    class FactIterator implements Iterator
    {
        @Override
        public boolean hasnext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
    public Iterator getIterator()
    {
        return null;
    }
    public void addFact(Fact fact)
    {

    }
}
