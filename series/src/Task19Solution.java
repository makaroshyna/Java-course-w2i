import java.util.Arrays;
import java.util.Objects;

class Task19Solution {

    private int[] x;
    private int y;

    public Task19Solution(int[] x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task19Solution solution = (Task19Solution) o;
        return y == solution.y &&
                Arrays.equals(x, solution.x);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(y);
        result = 31 * result + Arrays.hashCode(x);
        return result;
    }
}