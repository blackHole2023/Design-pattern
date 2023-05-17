package Facade;

// 外观类

/**
 * 在使用外观模式的示例中，外观类 ComputerFacade 封装了子系统类 CPU、Memory 和 HardDrive，
 * 提供了一个简单的接口 startComputer() 来启动计算机。客户端只需要与外观类进行交互，而不需要直接与子系统类进行交互，从而简化了客户端的操作。
 *
 * 相比之下，没有使用外观模式的示例中，客户端需要直接创建和调用子系统类的实例，需要了解子系统类的具体实现细节，并在客户端中进行相关的操作。
 * 这样的实现方式使得客户端代码变得冗长复杂，不易维护和扩展。
 *
 * 使用外观模式将复杂的子系统封装起来，对外提供一个简单的接口，使得客户端可以更加方便地使用子系统功能，同时也降低了客户端与子系统之间的耦合度。
 */
//这不是常规操作吗
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(1234L, hardDrive.read(1024L, 4096));
        cpu.jump(1234L);
        cpu.execute();
    }
}

// 子系统类
class CPU {
    public void freeze() {
        System.out.println("freeze");
    }
    public void jump(long position) {
        System.out.println("jump");
    }
    public void execute() {
        System.out.println("execute");
    }
}

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("load");
    }
}

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("read");
        return null;
    }
}

// 使用外观模式
class Main {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.startComputer();
    }
}
