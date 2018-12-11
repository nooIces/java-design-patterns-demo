package composite.item;

public interface AbstractFile {

    public void add(AbstractFile file);

    public void remove(AbstractFile file);

    public AbstractFile getChild(int index);

    public void lookFile();
}
