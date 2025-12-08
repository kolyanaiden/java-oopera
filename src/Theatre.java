public class Theatre {
    public static void main(String[] args) {
        // 1. Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        Actor actor1 = new Actor("Первый", "Актер", Gender.MALE, 185);
        Actor actor2 = new Actor("Второй", "Актер", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Третий", "Актер", Gender.MALE, 178);

        Director director1 = new Director("Первый", "Режиссер", Gender.FEMALE, 15);
        Director director2 = new Director("Второй", "Режиссер", Gender.MALE, 8);

        String musicAuthor = "Музыкальный автор";
        String choreographer = "Хореограф";

        // 2. Создать три спектакля: обычный, оперный и балет
        Show regularShow = new Show("Обычный", 120, director1);
        Opera opera = new Opera("Оперный", 180, director2,
                musicAuthor, "Текст либретто оперы", 40);
        Ballet ballet = new Ballet("Балет", 150, director1,
                musicAuthor, "Текст либретто балета", choreographer);

        System.out.println("Созданы спектакли:");
        System.out.println("1. " + regularShow);
        System.out.println("2. " + opera);
        System.out.println("3. " + ballet);
        System.out.println();

        // 3. Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль. Один актёр может участвовать в нескольких спектаклях.
        // 1 участвует в двух спектаклях
        regularShow.addActor(actor1);
        opera.addActor(actor1);

        // 2 участвует во всех спектаклях
        regularShow.addActor(actor2);
        opera.addActor(actor2);
        ballet.addActor(actor2);

        // 3 участвует в балете
        ballet.addActor(actor3);

        // одного и того же актера добавляю дажды
        ballet.addActor(actor3);
        System.out.println();

        // 4. Для каждого спектакля выведите на экран список актёров.
        regularShow.printActorsList();
        opera.printActorsList();
        ballet.printActorsList();

        // 5. Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        ballet.replaceActor("Первый", actor1);
        ballet.printActorsList();

        // 6. Попробуйте заменить в другом спектакле несуществующего актёра
        opera.replaceActor("Неизвестный", actor3);
        System.out.println();

        // 7.Для оперного и балетного спектакля выведите на экран текст либретто.
        opera.printLibretto();
        ballet.printLibretto();
    }
}