import java.util.Vector;

public class VectorH<E extends Comparable<E>> implements queue<E>
{
    private Vector<E> data;

    @Override
    public String toString() {
        return "VectorHeap{" + "data=" + data + '}';
    }

    public Vector<E> getData() {
        return data;
    }

    public void setData(Vector<E> data) {
        this.data = data;
    }

 
    public VectorH()
	{
		data = new Vector<E>();
	}


    public VectorH(Vector<E> v)
	{
		int i;
		data = new Vector<E>(v.size()); 
		for (i = 0; i < v.size(); i++)
		{
			add(v.get(i));
		}
	}


    protected static int padre(int i)
	{
		return (i-1)/2;
	}

    protected static int izq(int i)
	{
		return 2*i+1;
	}

    protected static int der(int i)
	{
		return (2*i+1) + 1;
	}

    protected void percolateUp(int hoja)
	{
		int padre = padre(hoja);
		E value = data.get(hoja);
		while (hoja > 0 &&
		(value.compareTo(data.get(padre)) < 0))
		{
			data.set(hoja,data.get(padre));
			hoja = padre;
			padre = padre(hoja);
		}
		data.set(hoja,value);
	}

    public void add(E value)
	{
		data.add(value);
		percolateUp(data.size()-1);
	}

    protected void pushDownraiz(int raiz)
	{
		int heapSize = data.size();
		E value = data.get(raiz);
		while (raiz < heapSize) {
			int hijopos = izq(raiz);
			if (hijopos < heapSize)
			{
				if ((der(raiz) < heapSize) &&
				((data.get(hijopos+1)).compareTo
				(data.get(hijopos)) < 0))
				{
					hijopos++;
				}
			if ((data.get(hijopos)).compareTo
				(value) < 0)
			{
				data.set(raiz,data.get(hijopos));
				raiz = hijopos;
			} else {
				data.set(raiz,value);
				return;
			}
			} else {
				data.set(raiz,value);
				return;
			}
		}
	}

/
    public E remove()
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownraiz(0);
		return minVal;
	}

    @Override
    public E getFirst() {
       return data.get(0);
    }


    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
