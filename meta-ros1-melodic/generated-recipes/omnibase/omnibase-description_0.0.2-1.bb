# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package constains the model files of the omnibase(omniwheeled robot)"
AUTHOR = "Harshal Deshpande <hardesh1deshpande@gmail.com>"
ROS_AUTHOR = "Harshal Deshpande"
HOMEPAGE = "https://erc-bpgc.github.io/omnibase/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "omnibase"
ROS_BPN = "omnibase_description"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    roscpp \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ERC-BPGC/omnibase-release/archive/release/melodic/omnibase_description/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/omnibase_description"
SRC_URI = "git://github.com/ERC-BPGC/omnibase-release;${ROS_BRANCH};protocol=https"
SRCREV = "5ac8daf4fd8ebd3295a57122886401a9426c1ed8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
