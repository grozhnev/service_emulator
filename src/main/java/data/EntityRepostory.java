package data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepostory extends CrudRepository<DataEntity, Integer>  {
    Object findOne(String query);
}
