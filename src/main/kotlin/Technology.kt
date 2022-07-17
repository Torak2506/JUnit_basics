
data class Technology(val id:Int, val name: String, var category: String, var ringName:String, var previousRing:String):Comparable<Technology>
{
    override fun compareTo(other: Technology): Int {
        if(this.category.compareTo(other.category)!=0)
        {
            return this.category.compareTo(other.category)
        }

        if(this.ringName.compareTo(other.ringName)!=0)
        {
            return this.ringName.compareTo(other.ringName)
        }

        return  this.name.compareTo(other.name);
    }


}