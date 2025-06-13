public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Будь ласка, передайте стрічку як аргумент командного рядка.");
            return;
        }

        String input = args[0];
        StringBuilder result = new StringBuilder();

        // Всі голосні (укр. + лат.)
        String vowels = "aeiouаеєиіїоуюяAEIOUАЕЄИІЇОУЮЯ";

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch) && !vowels.contains(String.valueOf(ch))) {
                // Це літера і вона приголосна → змінюємо регістр
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(Character.toUpperCase(ch));
                }
            } else {
                // Не літера або голосна → не змінюємо
                result.append(ch);
            }
        }

        System.out.println("Результат: " + result);
    }
}
