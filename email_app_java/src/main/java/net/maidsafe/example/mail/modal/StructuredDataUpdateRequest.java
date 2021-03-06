package net.maidsafe.example.mail.modal;

/**
 *
 * @author Krishna
 */
public class StructuredDataUpdateRequest {
    
    private long cipherOpts;
    private String data;

    public StructuredDataUpdateRequest(long cipherOpts, String data) {
        this.cipherOpts = cipherOpts;
        this.data = data;
    }

    public long getCipherOpts() {
        return cipherOpts;
    }

    public String getData() {
        return data;
    }
    
    
    
}
