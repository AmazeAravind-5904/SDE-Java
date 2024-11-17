class Solution:
    def find(self, arr, x):
        def first(arr,x):
            low,high=0,len(arr)-1
            first=-1
            while low<=high:
                mid=low+(high-low)//2
                if arr[mid]==x:
                    first=mid
                    high=mid-1
                elif arr[mid]<x:
                    low=mid+1
                else:
                    high=mid-1
            return first
        def last(arr,x):
            low,high=0,len(arr)-1
            last=-1
            while low<=high:
                mid=low+(high-low)//2
                if arr[mid]==x:
                    last=mid
                    low=mid+1
                elif arr[mid]<x:
                    low=mid+1
                else:
                    high=mid-1
            return last
        f=first(arr,x)
        l=last(arr,x)
        return [f,l] if f!=-1 else[-1,-1]
