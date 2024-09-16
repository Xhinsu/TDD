Recycle view: The application needs an adapter class.
Remember this class holds all the methods which deal with the RecyclerView implementation, such as creating, binding and determining the count of items.

This class needs to extend RecyclerView.Adapter<> (the adapter type will be created in an inner class). By extending this class, we are creating a custom adapter which customises the behaviour of the base RecyclerView.Adapter class for our specific purposes. This determines how the RecyclerView will populate and manage its items.
The class declaration will be underlined in red as there are methods that need to be overridden from the base RecyclerView.Adapter<> class that state how the data is bound to the views, how the views are create and recycled, and how the items are counted.

Before these methods are implemented, a static inner class needs to be created for the view holder.

Within the ItemAdapter class, create a new inner public static class called ItemViewHolder.

This inner class needs to extend RecyclerView.ViewHolder.
