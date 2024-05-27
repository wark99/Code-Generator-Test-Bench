package gen;

import org.springframework.web.multipart.MultipartFile;

public class InvoiceUploadRequest {
    private String orderCode;
    private MultipartFile nota;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public MultipartFile getNota() {
        return nota;
    }

    public void setNota(MultipartFile nota) {
        this.nota = nota;
    }
}

