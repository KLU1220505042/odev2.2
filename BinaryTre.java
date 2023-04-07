package projeler;

public class BinaryTre {
    Node root;

    // Bir düğümün alt düğümlerinin toplamını hesaplayan yardımcı yöntem
    int childSum(Node node) {
        if (node == null) {
            return 0;
        }

        // Sol ve sağ alt ağaçların toplamı alınır
        int leftSum = childSum(node.left);
        int rightSum = childSum(node.right);

        // Düğümün kendisi de toplama dahil edilir
        return (leftSum + rightSum + node.data);
    }

    // Kök değerinin alt düğümlerin toplamına eşit olup olmadığını kontrol eden yöntem
    boolean isChildSum(Node node) {
        if (node == null) {
            return true;
        }

        // Sol ve sağ alt ağaçların toplamı alınır
        int leftSum = childSum(node.left);
        int rightSum = childSum(node.right);

        // Kök değerinin alt düğümlerin toplamına eşit olup olmadığı kontrol edilir
        if (node.data == leftSum + rightSum) {
            return true;
        } else {
            return false;
        }
    }

    // Test için ana yöntem
    public static void main(String[] args) {
        BinaryTre tree = new BinaryTre();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(3);

        if (tree.isChildSum(tree.root)) {
            System.out.println("Kök değeri alt düğümlerin toplamıdır");
        } else {
            System.out.println("Kök değeri alt düğümlerin toplamı değildir");
        }
    }
}

// Düğüm sınıfı
class Dugum {
    int data;
    Dugum left, right;

    Dugum(int item) {
        data = item;
        left = right = null;
    }
}

