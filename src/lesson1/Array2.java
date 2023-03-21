package lesson1;

public class Array2 {

    public void main(String[] args){
        arrayClass list = new arrayClass();
        list.setArray(1,2,3,5,6);
        list.setNumber(2);
        list.arrayList();

    }
    class  arrayClass() {
        private int[] array = new int[];
        private int[] array2 = new int[array.length];
        private int number;

        public void setArray(int[] array) {
            this.array = array;
        }
        public int[] getArray() {
            return array;
        }
        public void setNumber(int number) {
            this.number = number;
        }
        public int getNumber() {
            return number;
        }

        public void arrayList() {
            if (number == 0) {
                System.out.print(array.length + " ");
                return;
            }
            for (int j = array.length - 1; j >= 0; j--) {
                if (j + number < 0) {
                    array2[j + number + array.length] = array[j];
                } else {
                    array2[j + number] = array[j];
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (i + number > array.length - 1) {
                    array2[i + number - array.length] = array[i];
                } else {
                    array2[i + number] = array[i];
                }

            }
            for (int x : array2) {
                System.out.print(x + " ");
            }
        }

    }

}
