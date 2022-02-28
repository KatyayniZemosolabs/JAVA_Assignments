public class Main {
    public static void main(String[] args) {
        int[] intarr = {1, 2, 13, 42, 54};
        SList<Integer> integerSList = new SList<>();

        SList<Integer> currList = integerSList;

        for (int i = 0; i < intarr.length; i++) {
            currList.next = new SList(intarr[i]);
            currList = currList.next;
        }

        integerSList = integerSList.next;

        SListIterator<Integer> iterator = integerSList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
