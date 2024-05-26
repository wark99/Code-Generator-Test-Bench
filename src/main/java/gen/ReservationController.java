package gen;

// ReservationController.java

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/{hotelId}/reservations")
public class ReservationController {

    @GetMapping
    public ResponseEntity<List<ReservationSummary>> getReservations(@PathVariable String hotelId,
                                                                    @RequestParam(required = false) String fromDate,
                                                                    @RequestParam(required = false) String toDate,
                                                                    @RequestParam(required = false) String firstName,
                                                                    @RequestParam(required = false) String lastName) {
        // Implementation of getReservations method
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{reservationId}")
    public ResponseEntity<ReservationSummary> getReservationDetails(@PathVariable String hotelId,
                                                                    @PathVariable String reservationId) {
        // Implementation of getReservationDetails method
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{reservationId}/guests")
    public ResponseEntity<List<Guest>> getReservationGuests(@PathVariable String hotelId,
                                                            @PathVariable String reservationId) {
        // Implementation of getReservationGuests method
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{reservationId}/guests")
    public ResponseEntity<Guest> addReservationGuest(@PathVariable String hotelId,
                                                     @PathVariable String reservationId,
                                                     @RequestBody Guest guest) {
        // Implementation of addReservationGuest method
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{reservationId}/guests/{guestId}")
    public ResponseEntity<Guest> getReservationGuestDetails(@PathVariable String hotelId,
                                                            @PathVariable String reservationId,
                                                            @PathVariable String guestId) {
        // Implementation of getReservationGuestDetails method
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{reservationId}/guests/{guestId}")
    public ResponseEntity<Guest> updateReservationGuest(@PathVariable String hotelId,
                                                        @PathVariable String reservationId,
                                                        @PathVariable String guestId,
                                                        @RequestBody Guest guest) {
        // Implementation of updateReservationGuest method
        return ResponseEntity.ok().build();
    }
}

