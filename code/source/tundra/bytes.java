package tundra;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-06-06 15:57:55.085
// -----( ON-HOST: -

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.nio.charset.Charset;
import permafrost.tundra.lang.BytesHelper;
import permafrost.tundra.lang.CharsetHelper;
import permafrost.tundra.lang.ExceptionHelper;
import permafrost.tundra.math.IntegerHelper;
// --- <<IS-END-IMPORTS>> ---

public final class bytes

{
	// ---( internal utility methods )---

	final static bytes _instance = new bytes();

	static bytes _newInstance() { return new bytes(); }

	static bytes _cast(Object o) { return (bytes)o; }

	// ---( server methods )---




	public static final void length (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(length)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $bytes
		// [o] field:0:required $length
		IDataCursor cursor = pipeline.getCursor();

		try {
		    byte[] bytes = (byte[])IDataUtil.get(cursor, "$bytes");

		    int length = 0;
		    if (bytes != null) length = bytes.length;

		    IDataUtil.put(cursor, "$length", IntegerHelper.emit(length));
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}



	public static final void normalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(normalize)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:optional $object
		// [i] field:0:optional $encoding
		// [o] object:0:optional $bytes
		IDataCursor cursor = pipeline.getCursor();

		try {
		    Object object = IDataUtil.get(cursor, "$object");
		    Charset charset = CharsetHelper.normalize(IDataUtil.getString(cursor, "$encoding"));

		    IDataUtil.put(cursor, "$bytes", BytesHelper.normalize(object, charset));
		} catch(java.io.IOException ex) {
		    ExceptionHelper.raise(ex);
		} finally {
		    cursor.destroy();
		}
		// --- <<IS-END>> ---


	}
}

