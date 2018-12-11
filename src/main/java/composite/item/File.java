package composite.item;

public class File implements AbstractFile {

    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("not supported");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("not supported");
    }

    @Override
    public AbstractFile getChild(int index) {
        return null;
    }

    @Override
    public void lookFile() {
        System.out.println("this is a file~ name:"+name);
    }
}
