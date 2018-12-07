package visitor;

import visitor.clothesEntity.Hat;
import visitor.clothesEntity.Shoes;
import visitor.clothesEnum.Color;
import visitor.clothesEnum.Size;
import visitor.visitors.MemberVisitor;
import visitor.visitors.NormalVisitor;

public class VisitorTest {
    public static void main(String[] args) {
        Hat hat = new Hat(Size.M, Color.WHITE, 100.0);
        Shoes shoes = new Shoes(Size.X, Color.RED, 150.0);

        NormalVisitor normalVisitor = new NormalVisitor(1);
        MemberVisitor memberVisitor = new MemberVisitor(0.8);

        hat.sell(normalVisitor);
        hat.sell(memberVisitor);
        shoes.sell(normalVisitor);
        shoes.sell(memberVisitor);

        normalVisitor.showBill();
        memberVisitor.showBill();
    }
}
