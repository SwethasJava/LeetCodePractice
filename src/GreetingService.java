class GreetingService {
    private final TimeService timeService;
    GreetingService(TimeService timeService) { this.timeService = timeService; }

    String getGreeting(String name) {
        if (timeService.isMorning()) {
            return "Good Morning " + name;
        } else {
            return "Hello " + name;
        }
    }
}