public class test {
/* //класс обработки события нажатия кнопки "Добавить выбранные в архив"
    private class AddChangeArchive implements ActionListener, Serializable {
        @Override
        public void actionPerformed(ActionEvent evenet) {
            String[] options = {"Сохранить"};

            JPanel panel = new JPanel();
            JLabel l = new JLabel("Введите дату : ");
            JTextField dataField = new JTextField(2);
            panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
            panel.add(l); panel.add(dataField);

            Date nowDate = new Date();
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            dataField.setText(format.format(nowDate));

            int selectedOption = JOptionPane.showOptionDialog(null, panel, "Добавление в архив выбранных", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
            if (selectedOption==0){
                //перевод текста на русский в файлообменнике
                UIManager.put("FileChooser.saveButtonText", "Сохранить");
                UIManager.put("FileChooser.cancelButtonText", "Отмена");
                UIManager.put("FileChooser.fileNameLabelText", "Наименование файла");
                UIManager.put("FileChooser.filesOfTypeLabelText", "Типы файлов");
                UIManager.put("FileChooser.lookInLabelText", "Директория");
                UIManager.put("FileChooser.saveInLabelText", "Сохранить в директории");
                UIManager.put("FileChooser.folderNameLabelText", "Путь директории");
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Файл Блокнот (.txt)", "txt"); //создаем фильтр .txt файлов
                fileChooser.removeChoosableFileFilter(fileChooser.getFileFilter());  //удаляем все фильтры в fileChooser
                fileChooser.setFileFilter(filter);                                 //устанавливаем созданный фильтр в файлЧоосер
                int saveWindow = fileChooser.showSaveDialog(null);  //создаем окно сохранения файла
                File file = null;
                if (saveWindow == JFileChooser.APPROVE_OPTION){  //если выбор файла прошел успешно и нажата кнопка СОХРАНИТЬ то выполняется код ниже
                    String nameFile = fileChooser.getSelectedFile().getName();  //передается имя выделенного файла
                    if (!nameFile.contains(".txt")){ //вариант для создания нового файла - имя вводится в поле "FileChooser.fileNameLabelText", "Наименование файла"
                        file = new File(fileChooser.getCurrentDirectory()+"\\"+nameFile+".txt"); //формируется имя файла - имя директории+\+имя файла+.txt
                    }
                    else {file = fileChooser.getSelectedFile();} //вариант для выбранного файла

                    try {
                        PrintStream writer = new PrintStream (new FileOutputStream(file,true));
                        for (Logos box:listBox){
                            if (box.getIsSelectedCheckBox()){    //если у бокса галочка на ЧекБоксе то формируем строку из значений полей и записываем в файл
                                String data = dataField.getText();
                                String nameTab = publicPanel.getName()+":";
                                String nameBox = box.getNameBox();
                                String fieldRes = box.getTextFieldRes();
                                String fieldLast = box.getTextFieldLast();
                                String fieldLeft = "("+box.getTextFieldLeft()+")";
                                String currentDistance = currentField.getText();
                                String lineSave = String.format("%-11s  %-15s %-40s Текущий пробег-%-12s Ресурс-%-12s Пробег последней замены-%-12s Осталось до замены-%-12s",data,nameTab,nameBox,currentDistance,fieldRes,fieldLast,fieldLeft);
                                writer.println(lineSave);
                            }
                        }
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Данные в файл добавлены"); //диалоговое окно о успешной записи данных в файл
                    } catch (IOException e) {
                    }
                }

            }
        }

    }*/


    /*for (Logos box:listBox){
                            if (box.getIsSelectedCheckBox()){    //если у бокса галочка на ЧекБоксе то формируем строку из значений полей и записываем в файл

                               // String lineSave = String.format("%-11s  %-15s %-40s Текущий пробег-%-12s Ресурс-%-12s Пробег последней замены-%-12s Осталось до замены-%-12s",data,nameTab,nameBox,currentDistance,fieldRes,fieldLast,fieldLeft);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Данные в файл добавлены"); //диалоговое окно о успешной записи данных в файл

     */
}
