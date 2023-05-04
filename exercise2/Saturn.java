public class Saturn implements Planet {

    @Override
    public void accept(Exlorer explorer) {
        explorer.accept(this);
    }
}
