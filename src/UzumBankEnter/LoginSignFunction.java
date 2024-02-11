package UzumBankEnter;
@FunctionalInterface
public interface LoginSignFunction<T,U> {
void notifiy(T t, U u);
}
