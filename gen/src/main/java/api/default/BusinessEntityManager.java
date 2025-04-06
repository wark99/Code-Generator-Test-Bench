import com entertainer.core.entity.EntityManager;
import com(entertainmentdb.orm, com entertainer.core.util, java.util.*, java.util.sql.*

public class BusinessEntityManager extends EntityManager<BusinessEntity> {

    @Override
    protected QueryBuilder businessQueryBuilder() {
        return new QueryBuilder(BusinessEntity.class)
                .select()
                .from(BusinessEntity)
                .orderBy("Name");

        // Employees query builder
        @Override
        protected QueryBuilder employeesQueryBuilder() {
            return select().from(EmployeeEntity).where(BusinessEntity::getEmployeeID);
        }

        // Customers query builder
        @Override
        protected QueryBuilder customersQueryBuilder() {
            return select().from(CustomerEntity).where(BusinessEntity::getEmployeeID);
        }
    }
}

