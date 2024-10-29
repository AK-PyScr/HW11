package HW11;

public class Phone {
    int number;
    String modelPhone;
    int weight;
    static String manufacturerCountry;

    public Phone(){

    }

    public Phone(int number, String modelPhone, String brand, int weight) {
        this.number = number;
        this.modelPhone = modelPhone;
        this.weight = weight;
    }
    public void receiveCall(String name){
        receiveCall(name, "");
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит абонент по имени " + name + (number.isEmpty() ? "" : " номер " + number));
    }
}

//2. Создайте в программе класс Phone.
//У телефона будет несколько полей класса: номер телефона, модель телефона, вес телефона. Сами выберете тип данных для этих переменных.
//Создайте поле “страна изготовитель телефона”. Для всех телефонов страна изготовитель будет ОДНОЙ.

//3. Создайте в телефоне конструктор без параметров и конструктор со всеми параметрами.

//4. Добавить в класс Phone метод receiveCall() который принимает параметром имя звонящего и выведет в консоль: “Звонит абонент по имени …”.

//        5. Добавить в класс Phone метод receiveCall() который принимает два параметра: имя звонящего и номер звонящего. Метод должен выводить в консоль: “Звонит абонент по имени …  номер …”

//        6. В классе Main создайте несколько телефонов и поэкспериментируйте с ними(сделайте телефоны с разными параметрами, попробуйте использовать метод receiveCall() с разным набором параметров).
//Примечание. Помните про принцип DRY