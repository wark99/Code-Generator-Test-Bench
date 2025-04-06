@RestController
public class PasswordResetController extends SpringRestController {
    @Autowired(SingletonBean)
    private final PasswordResetService passwordResetService;

    @GetMapping("/password-reset", RequestFormatAction.REQUEST_POST)
    public Resource getPasswordReset() throws HttpStatusException {
        var form = new Form();
        form.addField(new EmailInputField());
        form.addField(new Button("Reset Password"));
        return render/form;
    }

    @PostMapping(RequestFormatAction.REQUEST_POST)
    public Resource handle(final HttpServletRequest request, final HttpServletResponse response) throws RequestException {
        try (final String email = request.getParameter("email").value()) {
            if (email != null && !email.isEmpty()) {
                sendResetLink(email);
                return redirect(HttpServletResponse.HTTPRedirectResponse, new RedirectParameter("login", null));
            }
        }
        throw new ParameterizedException(new RuntimeException("Invalid email address or input field missing"));
    }

    @Override
    public void sendResetLink(String email) throws Exception {
        // Implementation to send reset link via email service
    }
}

