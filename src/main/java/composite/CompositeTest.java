package composite;

import composite.item.AbstractFile;
import composite.item.File;
import composite.item.Folder;

public class CompositeTest {
    public static void main(String[] args) {
        AbstractFile a, b, c, d, e, f, g;
        a = new Folder("root");
        b = new Folder("nodeA");
        c = new Folder("nodeB");
        d = new Folder("nodeC");

        e = new File("leafA");
        f = new File("leafB");
        g = new File("leafC");

        b.add(e);
        c.add(f);
        d.add(g);

        b.add(d);

        a.add(b);
        a.add(c);

        a.lookFile();
    }
}
