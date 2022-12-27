<<Версия заметки 2.0>>
1. Сделала Wrapper над NoteOperation и FileOperation. При рефакторинге кода использовал паттерн Decorator.
2. Упростил FileOperation. Изменил метод получаения id. При чтении из файла данные сразу конвертируются в List<Node>.
3. Упростил NoteOperation. CRUD работает с List<Note>. Без конвертации из List<String>.

P.S. Если код не будет запускаться, то откройте просто папку Homework6_2.0 