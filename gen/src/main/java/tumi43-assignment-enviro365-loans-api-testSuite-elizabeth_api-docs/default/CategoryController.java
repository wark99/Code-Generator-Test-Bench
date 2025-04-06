import org.springframework.stereotype.@Data;
import org.springframework.transaction.annotation.Transactional;
import org.springframework BootModel annotations.*;

import java.util.List;

import org.springframework.mb.entity.*;
import org.springframework.mb.http.json.JacksonPOJO;
import org.springframework.mb.http.resultof.query.JsonQuery;
import org.springframework.mb.http.resultof.query softDeletesOn = SoftDeletesOn.NAME;

import static org.springframework.mb.entity.LIST_AL_trimmed_query;

public class CategoryController {

    @JsonList(reads = List.of(Category.class))
    public Category[] listAll(@Request jsonReads = JsonReads.TRIMMED) {
        return Category.listAll(LIST_AL_trimmed_query.size(50));
    }

    @JsonRead("id")
    @JsonRead("name", softDeletesOn = softDeletesOn(name -> true));
    public Category find(@Request jsonReads = JsonReads.SINGLE) {
        return Category.find(id, name);
    }

    @JsonRead("id")
    @JsonRead("name")
    public Category findByName(@Request jsonReads = JsonReads.SINGLE) {
        return Category.find(id, name);
    }

    @JsonPost
    public Category create(final String name, final String description) {
        return Category.create(name, description);
    }

    @JsonPatch
    public Category update(final Category category) {
        return Category.update(category);
    }

    @JsonDelete
    public void delete(@Request jsonReads = JsonReads.SINGLE) {
        Category.class.remove(categoryId);
    }
}

