package zbihd.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rating")
public class Rating {
    @Id
    private String _id;
    private Double averageRating;
    private Integer numVotes;
    private String tconst;

    public Rating() {
    }

    public Rating(String _id, Double averageRating, Integer numVotes, String tconst) {
        this._id = _id;
        this.averageRating = averageRating;
        this.numVotes = numVotes;
        this.tconst = tconst;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(Integer numVotes) {
        this.numVotes = numVotes;
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "_id='" + _id + '\'' +
                ", averageRating=" + averageRating +
                ", numVotes=" + numVotes +
                ", tconst='" + tconst + '\'' +
                '}';
    }
}
