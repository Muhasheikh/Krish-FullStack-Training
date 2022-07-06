package Builder;

public class Employee {
	private final String empNo;
    private final String name;
    private final String gender;
    private final int age;

    public Employee(Builder builder) {
        this.empNo = builder.empNo;
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
    }


    static class Builder {

        private String empNo;
        private String name;
        private String gender;
        private int age;

        public Employee build() {
            return new Employee(this);
        }

        public Builder(String empNo) {
            this.empNo = empNo;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Employee {" +'\n'+
                "empNo='" + empNo + '\n' +
                "name='" + name + '\n' +
                "gender='" + gender + '\n' +
                "age=" + age + '\n'+
                '}';
    }
}
