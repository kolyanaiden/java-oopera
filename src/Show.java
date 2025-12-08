import java.util.ArrayList;
import java.util.List;

class Show {
    protected String title;
    protected int duration; // в минутах
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    public void printActorsList() {
        System.out.println("Актеры в спектакле \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  В спектакле пока нет актеров");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  - " + actor);
            }
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor.getName() + " " +
                    actor.getSurname() + " уже участвует в спектакле \"" + title + "\"");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актер " + actor.getName() + " " + actor.getSurname() +
                " добавлен в спектакль \"" + title + "\"");
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                // Проверяем, не пытаемся ли заменить на того же актера
                if (listOfActors.get(i).equals(newActor)) {
                    System.out.println("Актер " + newActor.getName() + " " +
                            newActor.getSurname() + " уже участвует в спектакле");
                    return;
                }

                Actor oldActor = listOfActors.set(i, newActor);
                System.out.println("Актер " + oldActor.getName() + " " + oldActor.getSurname() +
                        " заменен на " + newActor.getName() + " " + newActor.getSurname() +
                        " в спектакле \"" + title + "\"");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Актер с фамилией \"" + surnameToReplace +
                    "\" не найден в спектакле \"" + title + "\"");
        }
    }

    @Override
    public String toString() {
        return "Спектакль: \"" + title + "\", длительность: " + duration + " мин.";
    }
}
