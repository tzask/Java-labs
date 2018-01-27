import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Vector;

public class ToyStore {

    private Vector<Toy> toyVector = new Vector<Toy>();

    public void addToys() throws IOException {
        File toyFile = new File("D:\\toys.txt");
        StreamTokenizer st = new StreamTokenizer(new FileReader(toyFile));

        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            Toy t = new Toy();
            t.setName(st.sval);
            st.nextToken();
            t.setPrice((int) st.nval);
            st.nextToken();
            t.setMinAge((int) st.nval);
            st.nextToken();
            t.setMaxAge((int) st.nval);
            st.nextToken();
            t.setAdditional((int) st.nval);
            toyVector.add(t);
        }
    }

    public void sortAndPrintCubes() {
        Vector<Toy> cubesVector = new Vector<Toy>();

        //finding cubes in toyVector and adding them into a separate cubesVector
        for (int i = 0; i < toyVector.size(); i++) {

            if (toyVector.get(i).getName().startsWith("cubes")) {
                cubesVector.add(toyVector.get(i));
            }
        }

        //sorting cubesVector by the price
        Toy temp = new Toy();
        for (int i = 0; i < cubesVector.size(); i++)
        {
            for (int j = 1; j < cubesVector.size(); j++)
            {
                if (cubesVector.get(j).getPrice() < cubesVector.get(j - 1).getPrice())
                {
                    temp = cubesVector.get(j);
                    cubesVector.remove(j);
                    cubesVector.add(j, cubesVector.get(j - 1));
                    cubesVector.remove(j - 1);
                    cubesVector.add((j - 1), temp);
                }
            }
        }

        //print cubes
        System.out.println("The list of cubes that are suitable for a two-year-old child.Moreover, there price is not higher than 200 hryvnias.: ");
        System.out.println("[The list is sorted by ascending price]");
        System.out.println();
        for (int i = 0; i < cubesVector.size(); i++) {
            if(cubesVector.get(i).getPrice() < 20000 &&
                    cubesVector.get(i).getMinAge() <= 2 &&
                    cubesVector.get(i).getMaxAge() >=2) {
                System.out.println("Set of cubes №" + (i + 1) + ": " + cubesVector.get(i).getName());
                System.out.println("\t\t\tPrice: " + (cubesVector.get(i).getPrice()) / 100 + " hryvnias " + (cubesVector.get(i).getPrice()) % 100 + " kopeck");
                System.out.println("\t\t\tMin. age: " + cubesVector.get(i).getMinAge());
                System.out.println("\t\t\tMax. age: " + cubesVector.get(i).getMaxAge());
                System.out.println("\t\t\tQuantity of cubes in a set: " + cubesVector.get(i).getAdditional());
            }
        }
    }


    public static void main(String[] args) {
        ToyStore myStore = new ToyStore();

        try {
            myStore.addToys();
        } catch (IOException ce) {
            System.out.println("Error reading from file.");
        }

        myStore.sortAndPrintCubes();

    }
}