package com.grant.workouttracker.database.dao;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.grant.workouttracker.database.entities.Excercise;
import java.util.List;

@Dao
public interface ExcerciseDAO {
    @Query("Select * From Excercise")
    public List<Excercise> getAll();

    @Insert
    void insert(Excercise... exercises);

    @Delete
    void delete(Excercise excercise);
}
