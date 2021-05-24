package zbihd.mongodb.model.result;

public class Zadanie6Result {
    private String _id;
    private Integer totalNumberOfFilms;

    public Zadanie6Result() {
    }

    public Zadanie6Result(String _id, Integer totalNumberOfFilms) {
        this._id = _id;
        this.totalNumberOfFilms = totalNumberOfFilms;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getTotalNumberOfFilms() {
        return totalNumberOfFilms;
    }

    public void setTotalNumberOfFilms(Integer totalNumberOfFilms) {
        this.totalNumberOfFilms = totalNumberOfFilms;
    }

    @Override
    public String toString() {
        return "Zadanie6Result{" +
                "_id='" + _id + '\'' +
                ", totalNumberOfFilms=" + totalNumberOfFilms +
                '}';
    }
}
