import java.util.Arrays;
import java.util.Objects;

class Task116Solution {

    private int[] x;
    private int[] y;

    public Task116Solution(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task116Solution that = (Task116Solution) o;
        return Arrays.equals(x, that.x) &&
                Arrays.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(x);
        result = 31 * result + Arrays.hashCode(y);
        return result;
    }
}
