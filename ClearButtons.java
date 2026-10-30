JButton btnClear = new JButton("CLEAR");

frame.add(btnClear);

btnClear.addActionListener(e -> {
    txtName.setText("");
    txtAge.setText("");
    txtCourse.setText("");
    txtYear.setText("");
});

