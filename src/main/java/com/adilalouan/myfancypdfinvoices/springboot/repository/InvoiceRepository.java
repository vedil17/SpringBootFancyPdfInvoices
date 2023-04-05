package com.adilalouan.myfancypdfinvoices.springboot.repository;

import com.adilalouan.myfancypdfinvoices.springboot.model.Invoice;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface InvoiceRepository extends CrudRepository<Invoice, String> {

    @Query("Select id, pdf_url, user_id, amount from \"invoices\" where user_id= :userId")
    Iterable<Invoice> findByUserId(@Param("user_id") String userId);
}
