package arrayobject;

public class Array {

    private Person[] array;
    private int size;
    private int position;

    public Array() {
        array = null;
        size = 0;
        position = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        if (this.size > 0) {
            array = new Person[this.size];
        }
    }

    public int getPosition() {
        return position;
    }

    public Person print(int index) {
        return array[index];
    }

    public boolean empty() {
        return (getPosition() == 0);
    }

    public void add(Person person) {
        if (getPosition() < getSize()) {
            array[getPosition()] = person;
            position++;
        }
    }

    public int search(long id) {
        int i = 0, index = -1;
        while (i < getPosition()) {
            if (array[i].getId() == id) {
                index = i;
                break;
            } else i++;
        }
        return index;
    }

    public void remove(int index) {
        int i = index;
        while (i < getPosition() - 1) {
            array[i] = array[i + 1];
            i++;
        }
        position--;
    }

    public void clean() {
        position = 0;
    }
}
