package aulaException;

public class DeviceController {

	public void sendShutDown() {
		try {
		DeviceHandler handler = getHandler(DEV1);
		record = retrieveRecord(handle);
		pauseDevice(handle);
		clearDeviceWorkQueue(handle);
		closeDevice(handle); 
		} catch (Exception e) {
			logger.log(e.getMessage());
		}
		
			
	}
	...
}
