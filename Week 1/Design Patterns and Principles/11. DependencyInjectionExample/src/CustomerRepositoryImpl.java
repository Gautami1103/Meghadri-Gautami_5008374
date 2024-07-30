public class CustomerRepositoryImpl implements CustomerRepository {
    public Customer findCustomerById(String id) {
        return new Customer(id, "Meghadri Gautami", "gautamim@example.com");
    }
}