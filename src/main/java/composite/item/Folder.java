package composite.item;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile {

    private List<AbstractFile> files;

    private String name;

    public Folder(String name){
        this.name = name;
        files = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int index) {
        if(index > files.size()){
            return null;
        }
        return files.get(index);
    }

    @Override
    public void lookFile() {
        System.out.println("-----------");
        System.out.println("this is a folder~ name:" + name);
        for(AbstractFile file : files){
            file.lookFile();
        }
    }
}
