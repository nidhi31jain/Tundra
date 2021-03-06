package tundra;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2015-07-11 14:40:19 AEST
// -----( ON-HOST: 192.168.66.129

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import permafrost.tundra.lang.ExceptionHelper;
// --- <<IS-END-IMPORTS>> ---

public final class exception

{
	// ---( internal utility methods )---

	final static exception _instance = new exception();

	static exception _newInstance() { return new exception(); }

	static exception _cast(Object o) { return (exception)o; }

	// ---( server methods )---




	public static final void raise (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(raise)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:optional $message
		// [i] object:0:optional $exception
		IDataCursor cursor = pipeline.getCursor();
		
		try {
		    String message = IDataUtil.getString(cursor, "$message");
		    Object exception = IDataUtil.get(cursor, "$exception");
		
		    if (exception instanceof Throwable) {
		        ExceptionHelper.raise((Throwable)exception);
		    } else {
		        ExceptionHelper.raise(message);
		    }
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---

                
	}
}

