// Abstract class defining the template
class Watch {
    // Template method
    showTime() {
        this.start();
        this.displayTime();
        this.stop();
    }

    // Abstract methods to be implemented by subclasses
    start() {
        throw new Error('Method "start" must be implemented.');
    }

    displayTime() {
        throw new Error('Method "displayTime" must be implemented.');
    }

    stop() {
        throw new Error('Method "stop" must be implemented.');
    }
}

// Concrete subclass 1
class AnalogWatch extends Watch {
    start() {
        console.log('Analog watch started');
    }

    displayTime() {
        console.log('Analog watch shows the time with hands');
    }

    stop() {
        console.log('Analog watch stopped');
    }
}

// Concrete subclass 2
class DigitalWatch extends Watch {
    start() {
        console.log('Digital watch started');
    }

    displayTime() {
        console.log('Digital watch shows the time in digits');
    }

    stop() {
        console.log('Digital watch stopped');
    }
}

// Client code
const analogWatch = new AnalogWatch();
const digitalWatch = new DigitalWatch();

console.log('Using analog watch:');
analogWatch.showTime();

console.log('\nUsing digital watch:');
digitalWatch.showTime();