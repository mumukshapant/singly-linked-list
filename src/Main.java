public class Main {
    public static void main(String[] args)
    {


//        public boolean isEmpty()
//        {
//            return (head==null);
//        }

        LinkedList obj = new LinkedList();
        LinkedList obj2=new LinkedList();



        obj.insert(1); // 4,33,90 ,10,6,12
        obj.insert(2);
        obj.insert(3);
        obj.insert(4); //prev
        obj.insert(5); //curr
        obj.insert(6);
        // obj.printList();
        // obj.delete(12);
        //obj.search(459);
        obj2.insert(10); // 4,33,90 ,10,6,12
        obj2.insert(20);



           obj.printList();
           obj2.printList();



    }
}