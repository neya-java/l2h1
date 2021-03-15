public abstract class UnhumanCompetitor extends Competitor {
    public UnhumanCompetitor(String classifier, String name, int maxRunDistance, int maxJumpHeight) {
        super(classifier + " " + name, maxRunDistance, maxJumpHeight);
    }
}
