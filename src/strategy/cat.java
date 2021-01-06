package strategy;

public class cat  implements  Comparable<cat>{
    int weight,height;

    public cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }


    @Override
    public int compareTo(cat o) {
        return this.weight-o.height;
    }
}
