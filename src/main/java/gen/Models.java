package gen;

public class PostPaRequest {
    private String partner_id;
    private HostData host_data;
    private GuestData[] guests;
    private String resv_checkin;
    private String resv_checkout;

    // Getters and setters
}

public class PostIstatRequest {
    private String partner_id;
    private int region_id;
    private String date;
    private HostData host_data;
    private ReservationsData resvs_type;

    // Getters and setters
}

public class DeleteIstatRequest {
    private String partner_id;
    private int region_id;
    private String date;
    private HostData host_data;
    private String[] alloggiati_ids;

    // Getters and setters
}

public class HostData {
    private String wskey;
    private String username;
    private String password;
    private String apt_id;
    private boolean is_multi_apt;

    // Getters and setters
}

public class GuestData {
    private boolean is_main_guest;
    private String doc_type;
    private String id_doc;
    private String doc_place;
    private String birth_date;
    private String birth_country;
    private String birth_prov;
    private String birth_city;
    private String first_name;
    private String last_name;
    private int sex;
    private String citizenship;

    // Getters and setters
}

public class ReservationsData {
    private Reservation[] arrivi;
    private Reservation[] partenze;
    private Reservation[] prenotazioni;

    // Getters and setters
}

public class Reservation {
    private String resv_id;
    private String checkin_date;
    private String checkout_date;
    private int guest_num;
    private int room_num;
    private GuestData[] guests;

    // Getters and setters
}

