import subs.*;

/**
 * Created by ovitaliy on 20.10.2017.
 */
public class Main {


    public static void main(String... args) {

        long count;

        count = 1000;
        for (int i = 1; i < 7; i++) {
            count = count * 10;
            runCheck(count, new InstanceOfCheckAction());
            runCheck(count, new TypeIfCheckAction());
            runCheck(count, new TypeSwitchCheckAction());

            System.out.println();
            System.out.println();
        }
    }

    private static void runCheck(long count, CheckAction checkAction) {
        long started = System.currentTimeMillis();
        Object[] types = new Object[]{
                new Type1(),
                new Type2(),
                new Type3(),
                new Type4(),
                new Type5(),
                new Type6(),
                new Type7(),
                new Type8(),
                new Type9(),
                new Type10(),
        };

        for (long i = 0; i < count; i++) {
            for (Object type : types) {
                checkAction.check(type);
            }
        }


        System.out.print(
                String.format(
                        "%s\tfor %d count done in %d",
                        checkAction.toString(),
                        count,
                        System.currentTimeMillis() - started
                )
        );
        System.out.println();

    }


    private static abstract class CheckAction {
        abstract void check(Object value);
    }

    private static class InstanceOfCheckAction extends CheckAction {

        @Override
        void check(Object value) {
            if (value instanceof Type1) {
                ((Type1) value).doSomething(value);
            } else if (value instanceof Type2) {
                ((Type2) value).doSomething(value);
            } else if (value instanceof Type3) {
                ((Type3) value).doSomething(value);
            } else if (value instanceof Type4) {
                ((Type4) value).doSomething(value);
            } else if (value instanceof Type5) {
                ((Type5) value).doSomething(value);
            } else if (value instanceof Type6) {
                ((Type6) value).doSomething(value);
            } else if (value instanceof Type7) {
                ((Type7) value).doSomething(value);
            } else if (value instanceof Type8) {
                ((Type8) value).doSomething(value);
            } else if (value instanceof BaseBaseBaseType) {
                ((Type9) value).doSomething(value);
            } else if (value instanceof BaseBaseType) {
                ((Type10) value).doSomething(value);
            }
        }

        @Override
        public String toString() {
            return "InstanceOf";
        }
    }

    private static class TypeIfCheckAction extends CheckAction {

        @Override
        void check(Object value) {
            BaseType baseType = (BaseType) value;
            int type = baseType.type();

            if (type == Type1.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type2.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type3.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type4.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type5.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type6.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type7.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type8.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type9.TYPE) {
                baseType.doSomething(value);
            } else if (type == Type10.TYPE) {
                baseType.doSomething(value);
            }
        }

        @Override
        public String toString() {
            return "TypeIf   ";
        }
    }

    private static class TypeSwitchCheckAction extends CheckAction {

        @Override
        void check(Object value) {
            BaseType baseType = (BaseType) value;
            final int type = baseType.type();
            switch (type) {
                case Type1.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type2.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type3.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type4.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type5.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type6.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type7.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type8.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type9.TYPE:
                    baseType.doSomething(value);
                    break;
                case Type10.TYPE:
                    baseType.doSomething(value);
                    break;

            }

        }

        @Override
        public String toString() {
            return "TypeSwitch";
        }
    }
}
