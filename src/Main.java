public class Main {
    public static void main(String[] args) {

        Train tr1 = new Train("Ласточка", "B-901", 2011, "Rus",
                null, 301,  3500, 0, "Белорусский вокзал",
                "Минск-Пассажирский", 11);

        Train tr2 = new Train("Ленинград", "D-125", 2019, "Rus",
                null, 270, 1700, 0, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);

        System.out.println(tr1 + " " + tr2);

        Bus bus = new Bus(null, null, 0, null, null, 0);
        Bus bus2 = new Bus(null, null, 0, null, null, 0);




    }
}
